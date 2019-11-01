desenha();

function desenha() {
  let canvas = document.querySelector('#canvas')
  console.log(canvas)
  let contexto = canvas.getContext('2d')
  console.log(contexto)

  // fillrect => desenha um quadrado (x, y, L, A)

  contexto.fillStyle = '#f60'

  contexto.fillRect(225, 225, 100, 100)

  // clearect => apaga um quadrado (x, y, L, A)
  contexto.clearRect(245, 245, 60, 60)

  //strokerect => cria uma borda dentro do elemento
  contexto.strokeRect(250, 250, 50, 50)
}