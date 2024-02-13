package com.belicones.APIRest.service.tipos;

import com.belicones.APIRest.model.entity.tipos.carne.TipoDeCarne;
import com.belicones.APIRest.model.entity.tipos.entrega.TipoEntrega;
import com.belicones.APIRest.model.entity.tipos.pago.TipoPago;

import java.util.List;

public interface InterfaceTiposService {
    List<TipoDeCarne> listAllTiposCarnes();
    List<TipoPago> listAllTiposPago();

    List<TipoEntrega> listAllTiposEntregas();

}
