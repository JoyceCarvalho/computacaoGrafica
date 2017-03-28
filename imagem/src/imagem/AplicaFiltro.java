package imagem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AplicaFiltro {
	
	public static void main(String[] args) throws IOException {
		 
        try {
            //carrega nova imagem
            BufferedImage imagem1 = ImageIO.read(new File("img/gato.jpg"));
            //instancia um filtro e aplica a escala de cinza
            Filtro filtro = new Filtro();
            filtro.lamiar(imagem1,150);
            //gera uma nova imagem a partir da imagem1
            ImageIO.write(imagem1,"jpg",new File("img/imagem.jpg"));
 
            //aqui apenas para demonstração,
            //carreguei novamente as duas imagens para exibi-las dentro de um JFrame
            imagem1 = ImageIO.read(new File("img/gato.jpg"));
            BufferedImage imagem2 = ImageIO.read(new File("img/imagem.jpg"));
            Exibicao show = new Exibicao();
            show.exibirImagem(imagem1, imagem2);
            System.out.println("Filtro aplicado com sucesso!");
        }
        catch(IOException e){
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
        catch(Exception e){
            System.out.println("Erro! " + e.getMessage());
        }
    }
}
