let entrada = parseInt(prompt("Digite um número qualquer: "))

const nArray = getArray(entrada)
console.log(nArray)

function getArray(entrada) {
    let array = [];
    for (let i = 0; i < entrada; i++) {
        array[i] = parseInt(Math.random() * 100)
        
    }

    return array
}
// bla

let busca = parseInt(prompt("Digite o valor a ser pesquisado:"))
let resultadoBusca = BuscarValores(busca, nArray);
console.log("Total de valores encontrados no array: " + resultadoBusca)

console.log("narray:" + nArray.length)
function BuscarValores(busca, nArray) {

    let total = 0;
    for (let i = 0; i < nArray.length; i++) {
        if (nArray[i] == busca) {
            total ++;
        }
        
    }
    return total;
}