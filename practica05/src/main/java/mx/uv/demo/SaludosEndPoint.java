package mx.uv.demo;

import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import java.util.ArrayList;
import java.util.List;

@Endpoint
public class SaludosEndPoint {
    List<Saludos> saludos = new ArrayList<>();

    @PayloadRoot(localPart = "SaludarRequest",namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse saludar(@RequestPayload SaludarRequest peticion){
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setRespuesta("hola"+peticion.getNombre());
        Saludos e = new Saludos();
        e.setId(0);
        e.setNombre(peticion.getNombre());
        saludos.add(e);
        return respuesta;
    }

    @PayloadRoot(localPart="BuscarSaludosRequest",namespace="4is.uv.mx/saludos")
    @ResponsePayload
    public BuscarSalduosResponse buscarSalduos(){
        BuscarSalduosResponse respuesta = new BuscarSaludosResponse();
        //respuesta.getSaludos().add();
        for(int i = 0;  i < saludos.size(); i++){
            System.out.println(saludos.get(i));
            respuesta.getSaludos().add(saludos.get(i));
        }
        return respuesta;
    }
}
