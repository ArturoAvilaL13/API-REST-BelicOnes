package com.belicones.APIRest.service.tipos;

import com.belicones.APIRest.model.dao.tipos.carne.TipoDeCarneDao;
import com.belicones.APIRest.model.dao.tipos.entrega.TipoEntregaDao;
import com.belicones.APIRest.model.dao.tipos.pago.TipoPagoDao;
import com.belicones.APIRest.model.entity.tipos.carne.TipoDeCarne;
import com.belicones.APIRest.model.entity.tipos.entrega.TipoEntrega;
import com.belicones.APIRest.model.entity.tipos.pago.TipoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposImplementsService implements InterfaceTiposService {

    @Autowired
    private TipoDeCarneDao tipoDeCarneDao;

    @Autowired
    private TipoPagoDao tipoPagoDao;

    @Autowired
    private TipoEntregaDao tipoEntregaDao;

    @Override
    public List<TipoDeCarne> listAllTiposCarnes() {
        return (List<TipoDeCarne>) tipoDeCarneDao.findAll();
    }

    @Override
    public List<TipoPago> listAllTiposPago() {
        return (List<TipoPago>) tipoPagoDao.findAll();
    }

    @Override
    public List<TipoEntrega> listAllTiposEntregas() {
        return (List<TipoEntrega>) tipoEntregaDao.findAll();
    }
}
