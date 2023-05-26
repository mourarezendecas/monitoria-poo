package lista02.exercicio06;

public class Main {
    public static void main(String[] args) {
        Item[] itens = new Item[30];

        itens[0] = new Cd("Brothers in arms", 1985, 3311, "Excelente disco", "Dire Straits", 9);
        itens[1] = new Cd("Thriller", 1982, 4217, "Álbum mais vendido de todos os tempos", "Michael Jackson", 9);
        itens[2] = new Cd("Back in Black", 1980, 2545, "Um dos maiores álbuns de rock", "AC/DC", 10);
        itens[3] = new Cd("Rumours", 1977, 3907, "Um dos melhores álbuns de todos os tempos", "Fleetwood Mac", 11);
        itens[4] = new Cd("The Dark Side of the Moon", 1973, 4155, "Uma obra-prima do Pink Floyd", "Pink Floyd", 10);
        itens[5] = new Cd("Nevermind", 1991, 2886, "Um marco do rock dos anos 90", "Nirvana", 12);
        itens[6] = new Cd("Abbey Road", 1969, 3526, "Um dos melhores álbuns dos Beatles", "The Beatles", 17);
        itens[7] = new Cd("Legend", 1984, 3284, "Coletânea de sucesso de Bob Marley", "Bob Marley & The Wailers", 16);
        itens[8] = new Cd("Hotel California", 1976, 3702, "Um clássico do Eagles", "Eagles", 9);
        itens[9] = new Cd("The Joshua Tree", 1987, 5020, "Um dos álbuns mais icônicos do U2", "U2", 11);

        itens[10] = new Filme("2001: Uma odisseia no espaço", 1968, 8640, "Excelente filme", "Stanley Kubrick");
        itens[11] = new Filme("O Poderoso Chefão", 1972, 10500, "Clássico do cinema", "Francis Ford Coppola");
        itens[12] = new Filme("Interestelar", 2014, 10200, "Uma jornada emocionante pelo espaço-tempo", "Christopher Nolan");
        itens[13] = new Filme("A Origem", 2010, 8880, "Um filme de ficção científica cerebral", "Christopher Nolan");
        itens[14] = new Filme("Cidade de Deus", 2002, 7800, "Retrato impactante da vida nas favelas do Rio de Janeiro", "Fernando Meirelles, Kátia Lund");
        itens[15] = new Filme("Pulp Fiction", 1994, 9240, "Uma obra-prima de Quentin Tarantino", "Quentin Tarantino");
        itens[16] = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001, 10200, "O início da épica trilogia de fantasia", "Peter Jackson");
        itens[17] = new Filme("Clube da Luta", 1999, 8340, "Um filme provocativo e surpreendente", "David Fincher");
        itens[18] = new Filme("O Iluminado", 1980, 8760, "Um clássico de terror psicológico", "Stanley Kubrick");
        itens[19] = new Filme("Matrix", 1999, 8160, "Um marco no gênero de ficção científica", "Lana Wachowski, Lilly Wachowski");

        itens[20] = new Jogo("Hogwarts Legacy", 2023, 103680, "Revelio Simulator", 1, "Xbox");
        itens[21] = new Jogo("The Legend of Zelda: Breath of the Wild", 2017, 1440, "Um dos melhores jogos de aventura", 1, "Nintendo Switch");
        itens[22] = new Jogo("Red Dead Redemption 2", 2018, 2580, "Um épico de mundo aberto no Velho Oeste", 1, "PlayStation 4, Xbox One");
        itens[23] = new Jogo("The Witcher 3: Wild Hunt", 2015, 2040, "Uma aventura de RPG fantástica", 1, "PlayStation 4, Xbox One, PC");
        itens[24] = new Jogo("God of War", 2018, 3120, "Uma jornada mitológica de ação e aventura", 1, "PlayStation 4");
        itens[25] = new Jogo("Minecraft", 2011, 0, "Um jogo de construção e exploração", 1, "Multiplataforma");
        itens[26] = new Jogo("Super Mario Odyssey", 2017, 990, "Aventura divertida com o Mario", 1, "Nintendo Switch");
        itens[27] = new Jogo("Grand Theft Auto V", 2013, 3540, "Um mundo aberto de crime e ação", 1, "PlayStation 4, Xbox One, PC");
        itens[28] = new Jogo("Fallout 4", 2015, 1980, "Um RPG pós-apocalíptico", 1, "PlayStation 4, Xbox One, PC");
        itens[29] = new Jogo("Cyberpunk 2077", 2020, 3150, "Um RPG de mundo aberto futurista", 1, "PlayStation 4, Xbox One, PC");

        for(Item item: itens){
            System.out.println("---ITEM---");
            item.mostrarDados();
            System.out.println("---XXXX---");
        }
    }
}
