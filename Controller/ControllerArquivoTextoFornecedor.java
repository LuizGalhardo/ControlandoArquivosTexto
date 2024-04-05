/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fornecedor;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Luiz Galhardo
 */
public class ControllerArquivoTextoFornecedor extends ControllerArquivoTexto{
    
    private ArrayList<Fornecedor> fornes = new ArrayList<Fornecedor>();

    public boolean lerFornecedor() {
        fornes = new ArrayList<Fornecedor>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Fornecedor forn = new Fornecedor();
                forn.setRazaoSocial(registro.nextToken());
                forn.setCnpj(registro.nextToken());
                forn.setInscEst(registro.nextToken());
                forn.setEmail(registro.nextToken());
                forn.setContato(registro.nextToken());
                getFornes().add(forn);
            }
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean escreverFornecedor(boolean append) {
        boolean aux = false;
        for (int i = 0; i < fornes.size(); i++) {
            Fornecedor forn = fornes.get(i);
           String texto = forn.getRazaoSocial() + ";" + forn.getCnpj() + ";" + forn.getInscEst() + ";" + forn.getContato() + ";" + forn.getEmail() +  "--";
           setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }
    
    public void removeElemento(Fornecedor forn) {
        fornes.remove(forn);
    }
    
     public Fornecedor atualizaForn(Fornecedor forn) {
        for (int i = 0; i < fornes.size(); i++) {
            if (forn.getInd() == fornes.get(i).getInd()) {
                fornes.set(i, forn);
                escreverFornecedor(true);
                return fornes.get(i);
            }
        }
        return null;
    }
    
    public Fornecedor consForn(Fornecedor forn) {
    for (int i = 0; i < fornes.size(); i++) {
        if (forn.getCnpj().equals(fornes.get(i).getCnpj())) {
            return fornes.get(i);
        }
    }
    return null;
}

    /**
     * @return the clientes
     */
    public ArrayList<Fornecedor> getFornes() {
        return fornes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setFornes(ArrayList<Fornecedor> fornes) {
        this.fornes = fornes;
    }
    
}
