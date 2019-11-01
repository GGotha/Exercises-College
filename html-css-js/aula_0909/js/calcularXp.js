// pegando todos os herois pela classe

let herois = document.querySelectorAll('.heroi')
console.log('dados', herois)

// percorer o array com os herois, buscando todos o herois em um array e buscar as informacoes inseridas
for (let i = 0; i < herois.length; i++) {
    // pegar as informacoes do heroi
    let velocidade = herois[i].querySelector('.velocidade').textContent
    let agilidade = herois[i].querySelector('.agilidade').textContent
    let forca = herois[i].querySelector('.forca').textContent

    let xp = (Number(velocidade) + Number(agilidade) + Number(forca))

    console.log(xp)

    herois[i].querySelector('.xp-final').textContent = xp

    if (xp < 250) {
        //nao usar - não é boas práticas
        // herois[i].style.backgroundColor = '#f60'
        // herois[i].style.color = '#fff'
        herois[i].classList.add('bg-danger', 'text-light')
    }
}