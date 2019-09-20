/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author ice
 */
public abstract class Aluno {
    private String nome;
    private String instituicaoOrigem;

    public abstract String getOrigem();
    
    public String getDadosAluno()
    {
        return "Aluno " + getNome() + " - Origem: " +
                getOrigem() + getInstituicaoOrigem();
    }
    
    public String getNome() {
        return nome;
    }

    public String getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }
    
}
