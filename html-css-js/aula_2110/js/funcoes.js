// import Elementos from './elementos'

(function() {
    let cnv = document.querySelector('#canvas')

    let ctx = cnv.getContext('2d')

    let left = 37;
    let up = 38;
    let right = 39;
    let down = 40;


    let moveLeft = false;
    let moveUp = false;
    let moveDown = false;
    let moveRight = false;

    let quadrados = [];

    let quadradao = new Elementos(50, 175, 50, 50, "#f60")
    quadradao.velocidade = 3;

    quadrados.push(quadradao)

    let quadrado1 = new Elementos(500, 10, 20, 20, '#0f6')
    quadrados.push(quadrado1)

    let quadrado2 = new Elementos(300, 300, 120, 20, '#06f')
    quadrados.push(quadrado2)

    window.addEventListener('keydown', ((e) => {
        let key = e.keyCode;

        switch (key) {
            case left:
                moveLeft = true;
                break;
            case right:
                moveRight = true;
                break;
            case up:
                moveUp = true;
                break;
            case down:
                moveDown = true;
                break;
        }
    }, false))

    window.addEventListener('keyup', ((e) => {
        let key = e.keyCode;

        switch (key) {
            case left:
                moveLeft = false;
                break;
            case right:
                moveRight = false;
                break;
            case up:
                moveUp = false;
                break;
            case down:
                moveDown = false;
                break;
        }
    }, false))

    function loop() {
        window.requestAnimationFrame(loop, cnv)
        update();
        exibir()
    }

    function update() {
        if (moveLeft && !moveRight) {
            quadradao.posX -= quadradao.velocidade
        }

        if (moveRight && !moveLeft) {
            quadradao.posX += quadradao.velocidade
        }

        if (moveUp && !moveDown) {
            quadradao.posY -= quadradao.velocidade
        }

        if (moveDown && !moveUp) {
            quadradao.posY += quadradao.velocidade
        }
    }

    // restringe apenas a margem esquerda
    // quadradao.posX = Math.max(0, quadradao.posX)
    quadradao.posX = Math.max(0, Math.min(cnv.width - quadradao.width, quadradao.posX))
    quadradao.posY = Math.max(0, Math.min(cnv.height - quadradao.height, quadradao.posY))


    function exibir() {
        ctx.clearRect(0, 0, cnv.width, cnv.height);
        for (let i in quadrados) {
            let quadro = quadrados[i];
            
            if (quadro.visible) {
                ctx.fillStyle = quadro.color;
                ctx.fillRect(quadro.posX, quadro.posY, quadro.width, quadro.height)

                
            }
        }
    }
    loop()

}())