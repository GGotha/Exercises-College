let meuCanvas = document.querySelector('#canvas')
let ctx = meuCanvas.getContext('2d')

const q1 = {
  x: 10,
  y: 10,
  w: 100,
  h: 100,
}


// criarQuadrado()

window.addEventListener('keydown', teclaPressionada)

function teclaPressionada(e) {
  let codigo = e.keyCode;

  if (codigo === 37) {
    q1.x--
  }

  if (codigo === 38) {
    q1.y--
  }

  if (codigo === 39) {
    q1.x++
  }

  if (codigo === 40) {
    q1.y++
  }

  console.log(e)
  criarQuadrado()
}



function criarQuadrado() {
  ctx.clearRect(0, 0, meuCanvas.width, meuCanvas.height)
  ctx.fillStyle = '#DC143C'
  ctx.fillRect(q1.x, q1.y, q1.w, q1.h)
}