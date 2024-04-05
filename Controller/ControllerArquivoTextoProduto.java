/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Produto;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Luiz Galhardo
 */
public class ControllerArquivoTextoProduto extends ControllerArquivoTexto {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public boolean lerProduto() {
        produtos = new ArrayList<Produto>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Produto prod = new Produto();
                prod.setDesc(registro.nextToken());
                prod.setQuantidade(registro.nextToken());
                prod.setPavista(registro.nextToken());
                prod.setPaprazo(registro.nextToken());
                getProdutos().add(prod);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean escreverProd(boolean append) {
        boolean aux = false;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            String texto = produto.getDesc() + ";" + produto.getQuantidade() + ";" + produto.getPavista() + ";" + produto.getPaprazo() +"--";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }
    
    public void removeElemento(Produto prod) {
        produtos.remove(prod);
    }
    
    

    
    
    public Produto atualizaProduto(Produto prod) {
        for (int i = 0; i < produtos.size(); i++) {
            if (prod.getInd() == produtos.get(i).getInd()) {
                produtos.set(i, prod);
                escreverProd(true);
                return produtos.get(i);
            }
        }
        return null;
    }
    
     public Produto consProd(Produto produto) {
    for (int i = 0; i < produtos.size(); i++) {
        if (produto.getDesc().equals(produtos.get(i).getDesc())) {
            return produtos.get(i);
        }
    }
    return null;
}
    
    /**
     * @return the clientes
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    

}
