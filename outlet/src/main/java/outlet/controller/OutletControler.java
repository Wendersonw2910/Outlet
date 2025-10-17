package outlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import outlet.domain.Cliente;
import outlet.services.OutletService;

import java.util.List;

@RestController

public class OutletControler {
    @Autowired
    private OutletService outletService;
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(){return outletService.allClientes();}
    @PostMapping("/addCliente")
    public String addCliente(@RequestBody Cliente cliente){return outletService.addClienteService(cliente);}
}
