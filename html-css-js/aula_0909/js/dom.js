//pegar os elementos existente na página

//forma 1 pelo id
let dados1 = document.getElementById('tabela-herois')
console.log(dados1)

// forma 2 pela classe

let dados2 = document.getElementsByClassName('forca')
console.log(dados2)

let forcaHeroi1 = dados2[1].textContent
console.log(forcaHeroi1)


// forma 1 pela tag
let dados3 = document.getElementsByTagName('td')
console.log(dados3)

// forma 2 pela classe
let dados4 = document.querySelectorAll('.agilidade')
console.log(dados4[0])

// forma 2 pela tag - pegar apenas o 1º que encontrar
let dados5 = document.querySelector('td')
console.log(dados5)

// forma 2 pela tag - pegando todos os elementos
let dados6 = document.querySelectorAll('td')
console.log(dados6)


// pegando pelo id
let dados7 = document.querySelector('#heroi-um')
console.log(dados7)

