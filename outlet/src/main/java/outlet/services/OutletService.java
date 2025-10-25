package outlet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import outlet.domain.Cliente;
import outlet.repository.OutletRepository;

import java.util.List;

@Service
public class OutletService {
    @Autowired
    OutletRepository outletRepository;
    //alteração projeto
    public List<Cliente> allClientes(){return outletRepository.allClientes();}
    public String addClienteService(Cliente cliente){return outletRepository.addCliente(cliente);}
    //Metodo(findCliente) retorna(Cliente) parametro(nome do tipo String)
    public Cliente findCliente(String nome) {return outletRepository.findCliente(nome);}
}


