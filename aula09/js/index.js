function fazerLogin(event) {
    event.preventDefault(); // eveita o comportamento padrão de enviar um formulário

    let user = document.getElementById("inputUser").value;
    let password = document.getElementById("inputPassword").value;

    console.log('Você digitou ' + user + " : " + password);

    // construindo o objeto javascritp para enviar 
    let loginMsg = {
        email: user,
        cpf: user,
        password: password
    }

    //construindo a mensagem 'msg' que será enviada ao BackEnd
    // method - indica o método que será utilizado (GET, POST, DELETE ,...)
    // body - corpo da mensagem, o que deve ser envaido
    // headers: informando o tipo de conteúdo da mensagem
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    //fetch envia a 'msg' para o servidor
    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res)) //quando a resposta voltar...
}

function tratarRetorno(retorno) {
    if (retorno.status == 200) {
        document.getElementById("resultado").innerHTML = "Login com sucesso!";
        retorno.json().then(res => acessoPermitido(res));
    } else {
        document.getElementById("resultado").innerHTML = "Falha no Login!";
    }
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user));
    window.location = "interna.html";
}