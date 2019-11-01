//recuperar o botão que está no formulário é ele que dispara a função para calcular os dados

let btn = document.querySelector('#calcular')
console.log(btn)

// cancelar o evento padrao de submit pq reseta a pag e não roda nenhuma function

// atribuindo o event listener no btn
btn.addEventListener('click', function(e) {
    //cancela o evento padrao do elemento
    e.preventDefault()

    // pegando os valores digitados pelo usuario
    const v1 = document.querySelector('#valor1').value;
    const v2 = document.querySelector('#valor2').value;
    const operacao = document.querySelector('#operacao').value;

    // console.log(operacao)

    if (operacao == 1) {
        let soma = parseInt(v1) + parseInt(v2);
        console.log(soma)
    }

    if (operacao == 2) {
        let soma = parseInt(v1) - parseInt(v2);
        console.log(soma)
    }

    if (operacao == 3) {
        let soma = parseInt(v1) * parseInt(v2);
        console.log(soma)
    }

    if (operacao == 4) {
        let soma = parseInt(v1) / parseInt(v2);
        console.log(soma)
    }
})