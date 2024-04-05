package Controller;

import Model.Cliente;
import Controller.ControllerArquivoTexto;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Luiz Galhardo
 */

public class ControllerArquivoTextoCliente extends ControllerArquivoTexto{

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public boolean lerCliente() {
        clientes = new ArrayList<Cliente>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Cliente cli = new Cliente();
                cli.setNome(registro.nextToken());
                cli.setCpf(registro.nextToken());
                cli.setEmail(registro.nextToken());
                cli.setRg(registro.nextToken());
                cli.setContato(registro.nextToken());
                getClientes().add(cli);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean escreverCliente(boolean append) {
        boolean aux = false;
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            String texto = cliente.getNome() + ";" + cliente.getCpf() + ";" + cliente.getRg() + ";" + cliente.getContato() + ";" + cliente.getEmail() +  "--";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }
    
    public void removeElemento(Cliente cli) {
        clientes.remove(cli);
    }
    
    
    public Cliente atualizaCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (cliente.getInd() == clientes.get(i).getInd()) {
                clientes.set(i, cliente);
                escreverCliente(true);
                return clientes.get(i);
            }
        }
        return null;
    }
    
    public Cliente consCliente(Cliente cliente) {
    for (int i = 0; i < clientes.size(); i++) {
        if (cliente.getCpf().equals(clientes.get(i).getCpf())) {
            return clientes.get(i);
        }
    }
    return null;
}

    
    
    

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

   

}
