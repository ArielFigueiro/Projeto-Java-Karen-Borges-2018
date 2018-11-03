/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0341185
 */
public class Feedback {
    
    private String id_Feedback;
    private String mensagem;
    private int pontuacao;

    public Feedback(String id_Feedback, String mensagem, int pontuacao) {
        this.id_Feedback = id_Feedback;
        this.mensagem = mensagem;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Feedback{" + "id_Feedback=" + id_Feedback + ", mensagem=" + mensagem + ", pontuacao=" + pontuacao + '}';
    }

   
    
    public String getId_Feedback() {
        return id_Feedback;
    }

    public void setId_Feedback(String id_Feedback) {
        this.id_Feedback = id_Feedback;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
}
