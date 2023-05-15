import javax.swing.JOptionPane;

public class MediaAritmeticaVetor{
    public static void main(String[] args){
        //tenta executar
        try{
            float v[] = new float[10];
            float media;
            float soma = 0;
            String num;
            for(int i = 0; i < v.length; i++){
                num = JOptionPane.showInputDialog("Digite o valor"+(i+1)+":");
                v[i] = Float.parseFloat(num);
                soma+=v[i];
            }
            media = soma/v.length;
            JOptionPane.showMessageDialog(null, "Media"+media);
            //caso o codigo apresente erro
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a leitura");
        }
    }
}