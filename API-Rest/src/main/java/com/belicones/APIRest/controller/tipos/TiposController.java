package com.belicones.APIRest.controller.tipos;

import com.belicones.APIRest.model.entity.tipos.carne.TipoDeCarne;
import com.belicones.APIRest.model.entity.tipos.entrega.TipoEntrega;
import com.belicones.APIRest.model.entity.tipos.pago.TipoPago;
import com.belicones.APIRest.payload.MessageResponse;
import com.belicones.APIRest.service.tipos.InterfaceTiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TiposController {
    @Autowired
    private InterfaceTiposService tipoCarneService;
    @GetMapping("tipo/carnes")
    public ResponseEntity<?> showAllTiposDeCarnes(){
        List<TipoDeCarne> getList = tipoCarneService.listAllTiposCarnes();
        if (getList == null) {
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .mensaje("No hay registros")
                            .object(null)
                            .build()
                    , HttpStatus.OK);
        }

        return new ResponseEntity<>(
                MessageResponse.builder()
                        .mensaje("Lista de tipos de Carnes")
                        .object(getList)
                        .build()
                , HttpStatus.OK);
    }

    @GetMapping("tipo/pagos")
    public ResponseEntity<?> showAllTiposDePagos(){
        List<TipoPago> getList = tipoCarneService.listAllTiposPago();
        if (getList == null) {
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .mensaje("No hay registros")
                            .object(null)
                            .build()
                    , HttpStatus.OK);
        }

        return new ResponseEntity<>(
                MessageResponse.builder()
                        .mensaje("Lista de tipos de Carnes")
                        .object(getList)
                        .build()
                , HttpStatus.OK);
    }

    @GetMapping("tipo/entregas")
    public ResponseEntity<?> showAllTiposDeEntregas(){
        List<TipoEntrega> getList = tipoCarneService.listAllTiposEntregas();
        if (getList == null) {
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .mensaje("No hay registros")
                            .object(null)
                            .build()
                    , HttpStatus.OK);
        }

        return new ResponseEntity<>(
                MessageResponse.builder()
                        .mensaje("Lista de tipos de Carnes")
                        .object(getList)
                        .build()
                , HttpStatus.OK);
    }

}
