import javax.swing.*;
import java.util.ArrayList;


public class ExerJava1{
    public static void IniciarCodigo(){
        //variáveis
        int AlunosQuant = 0;
        ArrayList<String> Alunos = new ArrayList<String>(AlunosQuant);
        
        ArrayList<String> materias = new ArrayList<String>();
        ArrayList<Double> Artes = new ArrayList<Double>(AlunosQuant);
        ArrayList<Double> Fisica = new ArrayList<Double>(AlunosQuant);
        ArrayList<Double> Libras = new ArrayList<Double>(AlunosQuant);
        ArrayList<Double> Astronomia = new ArrayList<Double>(AlunosQuant);
        ArrayList<Double> medias = new ArrayList<Double>(AlunosQuant);
        String erro = "Erro ao compreender o conteúdo inserido, deseja reiniciar?";
        materias.add("Artes");//0
        materias.add("Física");
        materias.add("Libras");
        materias.add("Astronomia");
        // fim das variáveis

        try{
            try{int AlunosTemp = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao software de execução de média escolar, quantos alunos serão analisados? "));
            AlunosQuant = AlunosTemp;
            }catch(Exception p){
                if(JOptionPane.showConfirmDialog(null, erro) == 0){
                    IniciarCodigo();
                }else{
                    return;
                }
            }
        
            for(int i = 0; i<AlunosQuant;i++){//coleta nomes e as notas
                try{
                    String nomeTempString = JOptionPane.showInputDialog("Aluno "+(i+1)+": ");
                    Alunos.add(nomeTempString);

                    Double Nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota do aluno "+Alunos.get(i)+" na matéria: "+materias.get(0)));
                    Artes.add(Nota1);
                    Double Nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota do aluno "+Alunos.get(i)+" na matéria: "+materias.get(1)));
                    Fisica.add(Nota2);
                    Double Nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota do aluno "+Alunos.get(i)+" na matéria: "+materias.get(2)));
                    Libras.add(Nota3);
                    Double Nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota do aluno "+Alunos.get(i)+" na matéria: "+materias.get(3)));
                    Astronomia.add(Nota4);
                }catch(Exception o){
                    if(JOptionPane.showConfirmDialog(null, erro) == 0){
                        IniciarCodigo();
                    }else{
                        break;
                    }
                }
            }
            for(int j = 0; j<AlunosQuant; j++){
                Double calculomedia = (Artes.get(j)+Fisica.get(j)+Libras.get(j)+Astronomia.get(j))/materias.size();
                medias.add(calculomedia);
            }

            
        }finally{
             
            System.out.println("Nome | Artes | Física | Libras | Astronomia | Média\n");
            for(int k = 0; k<AlunosQuant; k++){
                System.out.println(Alunos.get(k)+" | "+Artes.get(k)+" | "+Fisica.get(k)+" | "+Libras.get(k)+" | "+Astronomia.get(k)+" | "+medias.get(k)+"\n");
            }
            
            //JOptionPane.showMessageDialog(null,""+Alunos.toArray(), ""+Artes.toArray());
        }
    }

    public static void main(String[] args){
        System.out.println("System began");
        IniciarCodigo();
        System.out.println("System terminated");
    }
}