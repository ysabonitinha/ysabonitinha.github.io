function startConfetti() {
    const confettiContainer = document.getElementById('confetti');

    // Cria 100 peças de confete
    for (let i = 0; i < 100; i++) {
        const confettiPiece = document.createElement('div');
        confettiPiece.classList.add('confetti-piece');
        confettiPiece.style.left = Math.random() * window.innerWidth + 'px'; // Posição horizontal aleatória
        confettiPiece.style.animationDelay = Math.random() * 5 + 's'; // Delay aleatório para animação de queda
        confettiContainer.appendChild(confettiPiece);
    }
}
