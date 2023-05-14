// Inicialização do canvas
const canvas = document.querySelector("canvas");
const contexto = canvas.getContext("2d");

// Inicialização dos sprites
const chao_sprite = new Image();
chao_sprite.src = "./sprites/chao-512x96.png";
const fundo_vermelho = new Image();
fundo_vermelho.src = "./sprites/ceu-vermelho.png"
const fundo_cidade = new Image();
fundo_cidade.src = "./sprites/cidade-vermelha.png";
const gota_spr = new Image();
gota_spr.src = "./sprites/agua_0.png";
const fogo_spr = new Image();
fogo_spr.src = "./sprites/fogo_0.png";

// Vetores de animação

// Bombeiro - direito
var bombeiro_anim_mov_direito = new Array(4);
bombeiro_anim_mov_direito[0] = new Image();
bombeiro_anim_mov_direito[0].src = "./sprites/bombeiro_mov_direito_0.png";
bombeiro_anim_mov_direito[1] = new Image();
bombeiro_anim_mov_direito[1].src = "./sprites/bombeiro_mov_direito_1.png";
bombeiro_anim_mov_direito[2] = new Image();
bombeiro_anim_mov_direito[2].src = "./sprites/bombeiro_mov_direito_2.png";
bombeiro_anim_mov_direito[3] = new Image();
bombeiro_anim_mov_direito[3].src = "./sprites/bombeiro_mov_direito_3.png";

var bombeiro_anim_parado_direito = new Array(2);
bombeiro_anim_parado_direito[0] = new Image();
bombeiro_anim_parado_direito[0].src = "./sprites/bombeiro_parado_direito_0.png";
bombeiro_anim_parado_direito[1] = new Image();
bombeiro_anim_parado_direito[1].src = "./sprites/bombeiro_parado_direito_1.png";

var bombeiro_anim_pulando_direito = new Array(2);
bombeiro_anim_pulando_direito[0] = new Image();
bombeiro_anim_pulando_direito[0].src = "./sprites/bombeiro_mov_direito_0.png";
bombeiro_anim_pulando_direito[1] = new Image();
bombeiro_anim_pulando_direito[1].src = "./sprites/bombeiro_mov_direito_2.png";

// Bombeiro - esquerdo
var bombeiro_anim_mov_esquerdo = new Array(4);
bombeiro_anim_mov_esquerdo[0] = new Image();
bombeiro_anim_mov_esquerdo[0].src = "./sprites/bombeiro_mov_esquerdo_0.png";
bombeiro_anim_mov_esquerdo[1] = new Image();
bombeiro_anim_mov_esquerdo[1].src = "./sprites/bombeiro_mov_esquerdo_1.png";
bombeiro_anim_mov_esquerdo[2] = new Image();
bombeiro_anim_mov_esquerdo[2].src = "./sprites/bombeiro_mov_esquerdo_2.png";
bombeiro_anim_mov_esquerdo[3] = new Image();
bombeiro_anim_mov_esquerdo[3].src = "./sprites/bombeiro_mov_esquerdo_3.png";

var bombeiro_anim_parado_esquerdo = new Array(2);
bombeiro_anim_parado_esquerdo[0] = new Image();
bombeiro_anim_parado_esquerdo[0].src = "./sprites/bombeiro_parado_esquerdo_0.png";
bombeiro_anim_parado_esquerdo[1] = new Image();
bombeiro_anim_parado_esquerdo[1].src = "./sprites/bombeiro_parado_esquerdo_1.png";

var bombeiro_anim_pulando_esquerdo = new Array(2);
bombeiro_anim_pulando_esquerdo[0] = new Image();
bombeiro_anim_pulando_esquerdo[0].src = "./sprites/bombeiro_mov_esquerdo_0.png";
bombeiro_anim_pulando_esquerdo[1] = new Image();
bombeiro_anim_pulando_esquerdo[1].src = "./sprites/bombeiro_mov_esquerdo_2.png";

// Vetores
var fogos = [];
var gota = [];
var tecla_atual = [];

// Delay
var disparo_delay = 0;
var fogo_delay = 0;

// Pontuação
var score = 0, record = 0, vidas = 4;

// Raio de colisão
const raioColisor = 10;

// Velocidade de movimento
const movimento_velocidade = 3;

// Controle de animação
var movendo = false;
var direita = true;
var tamanho_array_bombeiro = 0;
var contador_array_bombeiro = 0;
var contador_auxiliar_bombeiro = 0;

var bombeiro_quadro_atual = new Image();

// Inicializa a pontuação de record
pontos.record;

let telaAtiva = {};

function mudaTela(novaTela)
{
	telaAtiva = novaTela;
}

// Controle de telas
telas =
{
	inicio:
	{
		atualiza: function()
		{
			
		},
				
		desenha: function()
		{
			ceu.desenha_ceu();
			
			contexto.textAlign = "center"
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "50px Impact"
			contexto.fillText("- Incendiarius -", 256, 125);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("J - Jogar", 256, 250);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("T - Tutorial", 256, 300);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("H - História", 256, 350);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("C - Créditos", 256, 400);
		},
		
		jogar()
		{
			mudaTela(telas.jogo);
		},
		
		creditos()
		{
			mudaTela(telas.creditos);
		},
		
		tutorial()
		{
			mudaTela(telas.tutorial);
		},
		
		historia()
		{
			mudaTela(telas.historia);
		},
	},
	
	creditos:
	{
		atualiza: function()
		{
			
		},
		
		desenha: function()
		{
			ceu.desenha_ceu();
			
			contexto.textAlign = "center"

			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("- Créditos -", 256, 100);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "25px Impact"
			contexto.fillText("- Programação, pixel art, ideia -", 256, 210);
			contexto.fillStyle = "#ffdb86";
			contexto.font = "20px Impact"
			contexto.fillText("Jorge Miguel / Pedro Theobaldo", 256, 240);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "25px Impact"
			contexto.fillText("- Tutor -", 256, 320);
			contexto.fillStyle = "#ffdb86";
			contexto.font = "20px Impact"
			contexto.fillText("Lucas Serafim", 256, 350);
			
			contexto.fillStyle = "#ffdb86";
			contexto.font = "17px Impact"
			contexto.fillText("- Aperte ENTER para voltar -", 256, 480);
		},
		
		inicio()
		{
			mudaTela(telas.inicio);
		},
	},
	
	tutorial:
	{
		atualiza: function()
		{
			
		},
		
		desenha: function()
		{
			ceu.desenha_ceu();
			
			contexto.textAlign = "center"

			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("- Como jogar -", 256, 100);
			
			contexto.textAlign = "left"
			contexto.fillStyle = "#ffdb86";
			contexto.font = "20px Impact"
			contexto.fillText("Incendiarius é um jogo 2D de plataforma, na qual você", 5, 200);
			contexto.fillText("movimenta o personagem pelas teclas ← →, pula com o", 5, 220);
			contexto.fillText("o ESPAÇO, corre com o SHIFT e atira com o W.", 5, 240);
			
			contexto.fillText("Sua missão é eliminar as bolas de fogo que estão caindo do", 5, 280);
			contexto.fillText("céu, atirando água nelas.", 5, 300);
			
			contexto.fillText("Se uma bola de fogo atinge a superfície, 2 pontos são", 5, 340);
			contexto.fillText("subtraídos de seu placar, se uma bola de fogo é eliminado, 1", 5, 360);
			contexto.fillText("ponto é adicionado ao seu placar.", 5, 380);
			
			contexto.fillText("O jogador possui 4 vidas.", 5, 420);
			
			contexto.textAlign = "center"
			contexto.fillStyle = "#ffdb86";
			contexto.font = "17px Impact"
			contexto.fillText("- Aperte ENTER para voltar -", 256, 480);
		},
		
		inicio()
		{
			mudaTela(telas.inicio);
		},
	},
	
	historia:
	{
		atualiza: function()
		{
			
		},
		
		desenha: function()
		{
			ceu.desenha_ceu();
			
			contexto.textAlign = "center"

			contexto.fillStyle = "#ffdb86";
			contexto.font = "30px Impact"
			contexto.fillText("- História -", 256, 100);
			
			contexto.textAlign = "left"
			contexto.fillStyle = "#ffdb86";
			contexto.font = "20px Impact"
			contexto.fillText("Uma anomalia na escuridão do universo está desencadeando", 5, 200);
			contexto.fillText("uma chuva de fogos que está castigando o mundo. Como", 5, 220);
			contexto.fillText("bombeiro, sua missão é atirar jatos d'água nas imensidões", 5, 240);
			contexto.fillText("dos céus afim de apagar as bolas de fogo e prevenir que a", 5, 260);
			contexto.fillText("humanidade queime em chamas.", 5, 280);
			
			contexto.textAlign = "center"
			contexto.fillStyle = "#ffdb86";
			contexto.font = "17px Impact"
			contexto.fillText("- Aperte ENTER para voltar -", 256, 480);
			
		},
		
		inicio()
		{
			mudaTela(telas.inicio);
		},
	},
	
	jogo:
	{
		atualiza: function()
		{
			// Controle de movimentação e pulo
			teclas();
			
			// Controle de pontuação
			pontos();
			
			// Controle de colisão entre fogo, agua e player
			colisao_fogo_agua_player();
			
			// Controle de delay entre disparos
			delay_disparos();
			
			// Controle de spawn de fogos e delay
			fogo_spawner();
			
			// Controle de limites dos elementos na tela
			controle_limite();			
			
			bombeiro.atualiza();
		},
		
		desenha: function()
		{
			ceu.desenha_ceu();
			ceu_cidade.desenha_ceu_cidade();
			
			bombeiro.desenha_bombeiro();
			
			chao.desenha_chao();
		},
	},
	
	game_over:
	{
		atualiza: function()
		{
			
		},
		
		desenha: function()
		{
			ceu.desenha_ceu();
			
			contexto.textAlign = "center"

			contexto.fillStyle = "#ffdb86";
			contexto.font = "40px Impact"
			contexto.fillText("- Game Over -", 256, 220);
			contexto.font = "15px Impact"
			contexto.fillText("Você é muito ruim", 256, 240);
			
			contexto.textAlign = "center"
			contexto.fillStyle = "#ffdb86";
			contexto.font = "17px Impact"
			contexto.fillText("- Aperte ENTER para voltar -", 256, 480);
		},
		
		inicio()
		{
			mudaTela(telas.inicio);
		},
	}
}

// Classes - água
class Gota
{
	constructor(x,y)
	{
		this.visible = true;
		this.x = bombeiro.xPos;
		this.y = bombeiro.yPos;
		this.speed = 4;
		this.width = 32;
		this.height = 32;
	}
	
	Atualiza(i)
	{
		this.y -= this.speed;
		
		// Se atingir o céu, elimine o elemento do vetor
		if(this.y <= 0)
		{
			// Elimine o valor do vetor e retorne-o
			return gota.shift();
		}
		else
		{
			// Retorne nulo
			return null;
		}
	}
	
	Desenha()
	{
		contexto.drawImage(gota_spr, this.x, this.y);
	}
}

// Classes - fogo
class Fogo
{
	constructor(x,y)
	{
		this.visible = true;
		this.x = Math.floor(Math.random() * (480 - 0) + 0);
		this.y = Math.floor(Math.random() * -20);
		this.speed = 4;
	}
		
	Atualiza(i)
	{
		this.y += this.speed;
		
		// Se atingir o chão, elimine o elemento do vetor
		if(this.y >= 385)
		{
			// Elimine o valor do vetor e retorne-o
			score -= 2;
			return fogos.shift();
		}
		else
		{
			// Retorne nulo
			return null;
		}
	}
	
	Desenha()
	{
		contexto.drawImage(fogo_spr, this.x, this.y);
	}
}

function colisor(p1x, p1y, r1, p2x, p2y, r2)
{
	let radiusSum;
	let xDiff;
	let yDiff;
	
	radiusSum = r1 + r2;
	xDiff = p1x - p2x;
	yDiff = p1y - p2y;
	
	if(radiusSum > Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)))
	{
		return true;
	}
	else
	{
		return false;
	}
}

// Controle do vetor de fogos
function fogo_spawner()
{
	if(fogo_delay <= 0)
	{
		fogos.push(new Fogo());
		fogo_delay = Math.floor(Math.random() * (100 - 50) + 50);
	}
	else
	{
		fogo_delay--;
	}
}

// Céu - cidade
ceu_cidade =
{
	desenha_ceu_cidade: function()
	{
		contexto.drawImage(fundo_cidade, 0, 200);
	},
}

// Céu
ceu =
{
	desenha_ceu: function()
	{
		contexto.drawImage(fundo_vermelho, 0, 0);
	},
}

// Chão
chao = 
{
	xPos: 0,
	yPos: 512 - 96,
	
	desenha_chao: function()
	{
		contexto.drawImage(chao_sprite, chao.xPos, chao.yPos);
	},
}

// Bombeiro
bombeiro = 
{
	xPos: 240,
	yPos: 350,
	velocidade: 0,
	gravidade: .50,
	pulo: 10.5,
	bombeiro_altura: 31,
	bombeiro_largura: 31,
	
	desenha_bombeiro: function()
	{
		contexto.drawImage(bombeiro_quadro_atual, bombeiro.xPos, bombeiro.yPos);
	},
	
	atualiza: function()
	{
		bombeiro.velocidade = bombeiro.velocidade + bombeiro.gravidade;
		bombeiro.yPos = bombeiro.yPos + bombeiro.velocidade;
		
		//fixa o personagem no chao
		if (bombeiro.yPos > chao.yPos - bombeiro.bombeiro_altura)
		{
			bombeiro.yPos = chao.yPos - bombeiro.bombeiro_altura;	
			bombeiro.velocidade = 0;
		}
		
		animacao.animacao_bombeiro();
	},
}

// Controle de animações
animacao =
{
	// Animação do bombeiro
	animacao_bombeiro: function()
	{
		// Se estiver virado para o lado direito, FAÇA
		if(direita == true)
		{
			// Animação de pulo
			if(bombeiro.yPos < 385)
			{
				tamanho_array_bombeiro = bombeiro_anim_pulando_direito.length;
				
				if(contador_array_bombeiro >= tamanho_array_bombeiro)
				{
					contador_auxiliar_bombeiro = 0;
					contador_array_bombeiro = 0;
				}
				
				bombeiro_quadro_atual = bombeiro_anim_pulando_direito[contador_array_bombeiro];
				contador_auxiliar_bombeiro++;
				
				if(contador_auxiliar_bombeiro >= 60)
				{
					contador_auxiliar_bombeiro = 0;
					contador_array_bombeiro++;
				}
			}
			else
			{
				// Animação de movimento
				if(movendo == true)
				{
					tamanho_array_bombeiro = bombeiro_anim_mov_direito.length;
					
					if(contador_array_bombeiro >= tamanho_array_bombeiro)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro = 0;
					}
					
					bombeiro_quadro_atual = bombeiro_anim_mov_direito[contador_array_bombeiro];
					contador_auxiliar_bombeiro++;
					
					if(contador_auxiliar_bombeiro >= 7)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro++;
					}
				}
				else
				{
					// Animação de IDLE
					tamanho_array_bombeiro = bombeiro_anim_parado_direito.length;
					
					if(contador_array_bombeiro >= tamanho_array_bombeiro)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro = 0;
					}
							
					bombeiro_quadro_atual = bombeiro_anim_parado_direito[contador_array_bombeiro];
					contador_auxiliar_bombeiro++;
					
					if(contador_auxiliar_bombeiro >= 80)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro++;
					}
				}
			}
		}
		else // Se estiver virado para o lado esquerdo, FAÇA
		{
			// Animação de pulo
			if(bombeiro.yPos < 385)
			{
				tamanho_array_bombeiro = bombeiro_anim_pulando_esquerdo.length;
				
				if(contador_array_bombeiro >= tamanho_array_bombeiro)
				{
					contador_auxiliar_bombeiro = 0;
					contador_array_bombeiro = 0;
				}
				
				bombeiro_quadro_atual = bombeiro_anim_pulando_esquerdo[contador_array_bombeiro];
				contador_auxiliar_bombeiro++;
				
				if(contador_auxiliar_bombeiro >= 60)
				{
					contador_auxiliar_bombeiro = 0;
					contador_array_bombeiro++;
				}
			}
			else
			{
				// Animação de movimento
				if(movendo == true)
				{
					tamanho_array_bombeiro = bombeiro_anim_mov_esquerdo.length;
					
					if(contador_array_bombeiro >= tamanho_array_bombeiro)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro = 0;
					}
					
					bombeiro_quadro_atual = bombeiro_anim_mov_esquerdo[contador_array_bombeiro];
					contador_auxiliar_bombeiro++;
					
					if(contador_auxiliar_bombeiro >= 7)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro++;
					}
				}
				else
				{
					// Animação de IDLE
					tamanho_array_bombeiro = bombeiro_anim_parado_esquerdo.length;
					
					if(contador_array_bombeiro >= tamanho_array_bombeiro)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro = 0;
					}
							
					bombeiro_quadro_atual = bombeiro_anim_parado_esquerdo[contador_array_bombeiro];
					contador_auxiliar_bombeiro++;
					
					if(contador_auxiliar_bombeiro >= 80)
					{
						contador_auxiliar_bombeiro = 0;
						contador_array_bombeiro++;
					}
				}
			}
		}
	}
}

// Controle de delay entre disparos
function delay_disparos()
{
	if(disparo_delay > 0)
	{
		disparo_delay--;
	}
}

// Controle de limites dos elementos na tela
function controle_limite()
{
	if(gota.length != 0)
	{
		for(let i=0; i<gota.length; i++)
		{
			// Se retornar nulo, desenhe normalmente, SENÃO, não desenhe
			if (gota[i].Atualiza(i) == null)
			{
				gota[i].Desenha();
			}
		}
	}
	
	if(fogos.length != 0)
	{
		for(let j=0; j<fogos.length; j++)
		{
			// Se retornar nulo, desenhe normalmente, SENÃO, não desenhe
			if (fogos[j].Atualiza(j) == null)
			{
				fogos[j].Desenha();
			}
		}
	}
}

function colisao_fogo_agua_player()
{
	// Controle de colisores fogo x bombeiro
	if(fogos.length != 0)
	{
		for(var i=0; i<fogos.length; i++)
		{
			if(colisor(bombeiro.xPos, bombeiro.yPos, raioColisor, fogos[i].x, fogos[i].y, raioColisor))
			{
				vidas--;
				fogos.shift();
				
				if (vidas == 0)
				{
					score = 0;
					bombeiro.xPos = 240;
					bombeiro.yPos = 350;
					gota = [];
					vidas = 4;
					
					mudaTela(telas.game_over);
				}
			}
		}
	}
	
	// Controle de colisores gota x fogo
	if((fogos.length != 0) && (gota.length != 0))
	{
	loop1:
		for(var i=0; i<fogos.length; i++)
		{
			for(var j=0; j<gota.length; j++)
			{
				if(colisor(gota[j].x, gota[j].y, raioColisor, fogos[i].x, fogos[i].y, raioColisor))
				{
					score++;
					fogos.shift();
					gota.shift();
					break loop1;
				}
			}
		}
	}
}

// Controle de pontuação
function pontos()
{
	if(score > record)
	{
		localStorage.setItem("recordIncendiarius", score);
		record = score;
	}
	else if (record == null)
	{
		record = 0;
	}
	
	contexto.textAlign = "left"
	contexto.fillStyle = "#ffdb86";
	contexto.font = "20px Calibri"
	contexto.fillText("Pontuação: " +score+ " / " +record, 70, 53);
	contexto.fillText("Vidas: " +vidas, 70, 85);
	
	record:
	{
		record = localStorage.getItem("recordIncendiarius");
	}
}

// Verificação de teclas
function teclas()
{
	// Controle de movimento
	if((tecla_atual[37] || tecla_atual[65]) && (bombeiro.xPos >= -5))
	{
		if(tecla_atual[16])
		{
			movendo = true;
			direita = false;
			bombeiro.xPos -= (movimento_velocidade * 2);
		}
		else
		{
			movendo = true;
			direita = false;
			bombeiro.xPos -= movimento_velocidade;
		}
	}
	else if ((tecla_atual[39] || tecla_atual[68]) && (bombeiro.xPos <= 485))
	{
		if(tecla_atual[16])
		{
			movendo = true;
			direita = true;
			bombeiro.xPos += (movimento_velocidade * 2);
		}
		else
		{
			movendo = true;
			direita = true;
			bombeiro.xPos += movimento_velocidade;
		}
	}
	else
	{
		movendo = false;
	}
	
	// Controle de pulo
	if ((tecla_atual[32]) && (bombeiro.yPos >= 385))
	{
		bombeiro.velocidade = -bombeiro.pulo;
	}
}

// Controle de eventos
function eventos()
{
	// Evento de movimentação
	document.addEventListener("keydown", function(e)
							{
								tecla_atual[e.keyCode || e.which] = true;
							},true);
	document.addEventListener("keyup", function(e)
							{
								tecla_atual[e.keyCode || e.which] = false;
							},true);
							
	// Evento de disparos
	document.addEventListener("keydown", event => 
							{
								if((event.keyCode == 87) && (disparo_delay <= 0))
								{
									gota.push(new Gota(bombeiro.xPos,bombeiro.yPos));
									disparo_delay = 15;
								}
							});	
							
	// Evento do menu inicial
	document.addEventListener("keydown", event => 
							{
								if(telaAtiva.jogar)
								{
									if((event.keyCode == 74))
									{
										telaAtiva.jogar();
									}
								}
							});
							
	document.addEventListener("keydown", event => 
							{
								if(telaAtiva.creditos)
								{
									if((event.keyCode == 67))
									{
										telaAtiva.creditos();
									}
								}
							});	
							
	document.addEventListener("keydown", event => 
							{
								if(telaAtiva.tutorial)
								{
									if((event.keyCode == 84))
									{
										telaAtiva.tutorial();
									}
								}
							});	
							
	document.addEventListener("keydown", event => 
							{
								if(telaAtiva.historia)
								{
									if((event.keyCode == 72))
									{
										telaAtiva.historia();
									}
								}
							});	
							
	// Evento dos créditos, tutorial e história
	document.addEventListener("keydown", event => 
							{
								if(telaAtiva.inicio)
								{
									if((event.keyCode == 13))
									{
										telaAtiva.inicio();
									}
								}
							});
}

// Loop
function loop()
{
	telaAtiva.desenha();
	telaAtiva.atualiza();
	
	// Execute para sempre
	requestAnimationFrame(loop);
}

mudaTela(telas.inicio);

eventos();

loop();
