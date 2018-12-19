var pagina = document.location.href;
var vet = pagina.split("/");
console.log(vet[vet.length-1]);
//pegar a tela atual

var vetorResposta;
var contaProduto;
var objSelecionado;

function buscaProdutoAtualiza(){
    con.open("GET", "http://localhost:8080/JLMANAGEMENT/MercadoriaServlet?serv=&",
    true);

    //formato das  informações
    con.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    con.onload = function(x) {
        var respostaServ = x.currentTarget.responseText;
        alert(respostaServ);
        };

    // verificar como faz pra pegar o name do form
    
       /* var nome = document.forms["form1AtualizaMerc"]["nome"].value;
        var nome2 = 
        var mVenda = document.forms["form1AtualizaMerc"]["mesvenda"].value;
        var aVenda = document.forms["form1AtualizaMerc"]["anovenda"].value;
        var vVenda = document.forms["form1AtualizaMerc"]["valorvenda"].value;*/
}

function atualizaProduto(){
    //outra função? tirar dúvida. como fazer para pegar a mercadoria selecionada no quadro
    var nome = document.forms["form1AtualizaMerc"]["nome"].value;
    //se a opção desejada está ativa
    var ativo = document.forms["form1AtualizaMerc"]["compra"].value;
    if( ativo == true){
        var qCompra = document.forms["form1AtualizaMerc"]["quantcompra"].value;
        var dCompra = document.forms["form1AtualizaMerc"]["datacompra"].value;
        con.send("serv=atualiza&nome=" +nome+ "&quantcompra="+qCompra+ "&datacompra="+dCompra+ "&ativo="+ativo);
    }
    var con = new XMLHttpRequest();
    //formato das  informações
    con.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    con.open("post", "http://localhost:8080/JLMANAGEMENT/MercadoriaServlet",
    true);
    con.onload = function(x) {
        var respostaServ = x.currentTarget.responseText;
        alert(respostaServ);
        };
    /*else{
        con.send("serv=consulta&nome=" +nome);
    }*/
}
function exibicao(){
    var form = document.forms["formEx"];
    form["nome"].value = objSelecionado.nome;
    form["tipo"].value = objSelecionado.tipo;
    form["fornec"].value = objSelecionado.fornecedor;
    form["precM"].value = objSelecionado.custo;
    form["imp"].value = objSelecionado.percentualImposto;
    form["perFrete"].value = objSelecionado.percentualFrete;
    form["date"].value = objSelecionado.dataCompra;
    form["inf"].value = objSelecionado.infAdicionais;
    form["quantC"].value = objSelecionado.qntCompra;
    form["quantE"].value = objSelecionado.qntEstoque;
    form["quantM"].value = objSelecionado.qntMim;
    form["ref"].value = objSelecionado.referencia;
    //objAtivo = objSelecionado;
}
function selecionar(id){
    var objSelecionado = vetorResposta.resposta[id];
    var lista = document.getElementById("listaProd").children;
    lista[id].classList.toggle("selecionado");
 }
function buscaProduto(){
   var requisicao = "http://localhost:8080/JLMANAGEMENT/MercadoriaServlet?";
   //verifica em qual página o usuário está
   var ativo = document.forms["formConsulta"]["infadd"].value;
    var pagina = document.location.href;
        var vet = pagina.split("/");
        var atual = (vet[vet.length-1]);
        if(atual == "consultaMerc.html"){
            //pega as informações dos inputs
            var nome = document.forms["formConsulta"]["nome"].value;
            if(ativo == true){
                var tipo = document.forms["formConsulta"]["tipo"].value;
                var preco = document.forms["formConsulta"]["preco"].value;
                var fornec = document.forms["formConsulta"]["fornecedor"].value;
                requisicao+="serv=consulta&nome=" +nome+ "&tipo="+tipo+ "&preco="+preco+ "&fornecedor="+fornec+ "&ativo="+ ativo;
            }else{
                requisicao+="serv=consulta&nome=" +nome+ "ativo="+ativo;
            }
        }else{
            if(atual == "atualizaMerc.html"){
                var nome = document.forms["form1AtualizaMerc"]["nome"].value;
                requsicao+="serv=atualiza&nome="+nome;
            }
        }    
        //estrutura
        var con = new XMLHttpRequest();
        //formato das  informações
        con.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        con.open("GET", requisicao,
        true);
    //tratar o retorno dos servlets
    if(atual == "consultaMerc.html"){
        con.onload = function(x) {
            var respostaServ = x.currentTarget.responseText;
            vetorResposta = JSON.parse(respostaServ);
            if (vetorResposta.resultado == "Mercadoria não encontrada!" && vetorResposta.cod == 200 ) {
                alert("Não foi possível encontrar este produto!");
            }else{
                //como armazenar o retorno do vetor de mercadorias encontradas
                if(vetorResposta.cod == 200 && vetorResposta.resposta.length > 0){
                    var lista = document.getElementById("listaProd");
                    for(i=0;i<vetorResposta.length;i++){
                        var novoElemento = document.createElement("li");
                        novoElemento.setAttribute("onclick","selecionar("+contaProduto+")");
                        var texto = document.createTextNode(vetorResposta.resultado[i].nome);
                        novoElemento.appendChild(texto);
                        lista.appendChild(novoElemento);
                        contaProduto++;
                    }   
                }else{
                    if(vetorResposta.cod == 302){
                        alert(vetorResposta.resposta);
                    }
                }
            }
        };
    }else{
        if(atual == "atualizaMerc.html"){
            con.onload = function(x) {
                var respostaServ = x.currentTarget.responseText;
                var objResposta = JSON.parse(respostaServ);
                if (objResposta.resultado == null) {
                    alert("Não foi possível encontrar este produto!");
                }else{
    
                }
            /*alert(respostaServ);*/
            };
        }
    }    
  
}

//copiei a função só para facilitar

/*function addLista(){
    var lista = document.getElementById("listaProd");
    
    var nomeProd = document.getElementById("nomeProduto");
    
    var novoElemento = document.createElement("li");
    
    var texto = document.createTextNode(nomeProd.value);
    novoElemento.setAttribute("onclick","selecionar("+contaProduto+")");
    
    contaProduto++;
    
    novoElemento.appendChild(texto);
    
    lista.appendChild(novoElemento);
    
    nomeProd.value = "";
}*/

function limpaCampos(){
    var formCadastra = document.forms["formCadMerc"];
    formCadastra["nome"].value = "";
    formCadastra["tipo"].value = "";
    formCadastra["fabricante"].value = "";
    formCadastra["precocusto"].value = "";
    formCadastra["imposto"].value = "";
    formCadastra["frete"].value = "";
    formCadastra["data"].value = "";
    formCadastra["quantcompra"].value = "";
    formCadastra["infadd"].value = "";
    formCadastra["quantestoque"].value = "";
    formCadastra["qntminima"].value = "";
    formCadastra["referencia"].value = "";
}
function cadastraMerc(){
    var nome = document.forms["formCadMerc"]["nome"].value;
    var tipoMerc = document.forms["formCadMerc"]["tipo"].value;
    var fabricante = document.forms["formCadMerc"]["fabricante"].value;
    var pCusto = document.forms["formCadMerc"]["precocusto"].value;
    var imposto = document.forms["formCadMerc"]["imposto"].value;
    var frete = document.forms["formCadMerc"]["frete"].value;
    var data = document.forms["formCadMerc"]["data"].value;
    var qCompra = document.forms["formCadMerc"]["quantcompra"].value;
    var qEstoque = document.forms["formCadMerc"]["quantestoque"].value;
    var qMinEstoque = document.forms["formCadMerc"]["qntmin"].value;
    var referencia = document.forms["formCadMerc"]["referencia"].value;
    if(document.forms["formCadMerc"]["checkinf"].value == true){
        var infAdi = document.forms["formCadMerc"]["infadd"].value;
        con.send("serv=cadastra&nome=" + nome + "&tipo=" + tipoMerc + "&fabricante=" + fabricante +
            "&precocusto=" + pCusto+ "&imposto=" + imposto + "&frete=" + frete +
            "&data="+data+ "&quantcompra"+ qCompra+ "&infadd"+infAdi+ 
            "&quantestoque"+qEstoque+ "&qntmin"+qMinEstoque+ "&referencia"+referencia );
    }else{
        con.send("serv=cadastra&nome=" + nome + "&tipo=" + tipoMerc + "&fabricante=" + fabricante +
            "&precocusto=" + pCusto+ "&imposto=" + imposto + "&frete=" + frete +"&data="+data+ "&quantcompra="
            +qCompra+"&quantestoque="+qEstoque+ "&qntmin="+qMinEstoque+ "&referencia="+referencia );
    }
    var con = new XMLHttpRequest();
    con.open("post", "http://localhost:8080/JLMANAGEMENT/MercadoriaServlet",
    true);

    //formato das  informações
    con.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    con.onload = function(x) {
        var respostaServ = x.currentTarget.responseText;
        alert(respostaServ);
        //fazer verificação
        limpaCampos();
    };
}
    
