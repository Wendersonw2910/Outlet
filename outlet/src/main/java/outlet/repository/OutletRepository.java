package outlet.repository;

import org.springframework.stereotype.Repository;
import outlet.domain.Cliente;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OutletRepository {
    List<Cliente> clientes = new ArrayList<>();

    public OutletRepository() {
        clientes.add(new Cliente("João", "Silva", 30, "Rua A, 123", 11987654321L));
        clientes.add(new Cliente("Maria", "Oliveira", 25, "Rua B, 456", 11991234567L));
        clientes.add(new Cliente("Carlos", "Santos", 40, "Rua C, 789", 21998765432L));
        clientes.add(new Cliente("Ana", "Souza", 35, "Rua D, 101", 31999887766L));
        clientes.add(new Cliente("Pedro", "Costa", 28, "Rua E, 202", 21988776655L));
        clientes.add(new Cliente("Juliana", "Pereira", 32, "Rua F, 303", 11977665544L));
        clientes.add(new Cliente("Fernando", "Almeida", 45, "Rua G, 404", 11966554433L));
        clientes.add(new Cliente("Patrícia", "Gomes", 27, "Rua H, 505", 11955443322L));
        clientes.add(new Cliente("Lucas", "Rodrigues", 31, "Rua I, 606", 21944332211L));
        clientes.add(new Cliente("Camila", "Fernandes", 29, "Rua J, 707", 31933221100L));
    }
    public List<Cliente> allClientes(){return clientes;}
}
