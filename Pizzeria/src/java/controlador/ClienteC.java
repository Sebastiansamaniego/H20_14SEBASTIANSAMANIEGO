package controlador;

import dao.ClienteImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Cliente;

@Named(value = "clienteC")
@SessionScoped
public class ClienteC implements Serializable {

    private Cliente modelo;
    private ClienteImpl dao;
    private List<Cliente> listarcli;

    public ClienteC() {
        modelo = new Cliente();
        dao = new ClienteImpl();
        listarcli = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }
    }

    public void llenardatos(Cliente cli) {
        try {
            this.modelo = cli;
            System.out.println("Este es clisona: " + cli);

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar() {
        try {
            dao.registrar(modelo);
            System.out.println("Cliente: " + modelo.toString());
            listar();
        } catch (Exception e) {
            System.out.println("Error al registrar ClienteC: " + e.getMessage());
        }
    }

    public void editar() {
        try {
            dao.editar(modelo);
        } catch (Exception e) {
            System.out.println("Error al editar ClienteC" + e.getMessage());
        }
    }

    public void eliminar(Cliente cli) {
        try {
            System.out.println("envia cli" + cli);
            dao.eliminar(cli);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar ClienteC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarcli = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar ClienteC" + e.getMessage());
        }
    }

    public void limpiar() {
        this.modelo= new Cliente();
    }

    public void prueba() {
        System.out.println("tas mandando " + modelo.toString());

    }

    /*son los getter y setter*/
    public Cliente getModelo() {
        return modelo;
    }

    public void setModelo(Cliente modelo) {
        this.modelo = modelo;
    }

    public ClienteImpl getDao() {
        return dao;
    }

    public void setDao(ClienteImpl dao) {
        this.dao = dao;
    }

    public List<Cliente> getListarcli() {
        return listarcli;
    }

    public void setListarP(List<Cliente> listarcli) {
        this.listarcli = listarcli;
    }

}
