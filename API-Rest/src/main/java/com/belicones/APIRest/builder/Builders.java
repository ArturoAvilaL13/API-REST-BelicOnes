package com.belicones.APIRest.builder;

import com.belicones.APIRest.model.dto.CarneDto;
import com.belicones.APIRest.model.dto.UsuarioDto;
import com.belicones.APIRest.model.dto.tipos.carne.TipoDeCarneDto;
import com.belicones.APIRest.model.entity.Carne;
import com.belicones.APIRest.model.entity.Usuario;
import com.belicones.APIRest.model.entity.tipos.carne.TipoDeCarne;

public class Builders {
    public Usuario builderUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .idUsuario(usuarioDto.getIdUsuario())
                .correo(usuarioDto.getCorreo())
                .contrasena(usuarioDto.getContrasena())
                .nombre(usuarioDto.getNombre())
                .apellidos(usuarioDto.getApellidos())
                .telefono(usuarioDto.getTelefono())
                .direccion(usuarioDto.getDireccion())
                .idTipoDeUsuario(usuarioDto.getIdTipoDeUsuario())
                .build();
    }
    public UsuarioDto builderUsuario(Usuario usuario) {
        return UsuarioDto.builder()
                .idUsuario(usuario.getIdUsuario())
                .correo(usuario.getCorreo())
                .contrasena(usuario.getContrasena())
                .nombre(usuario.getNombre())
                .apellidos(usuario.getApellidos())
                .telefono(usuario.getTelefono())
                .direccion(usuario.getDireccion())
                .idTipoDeUsuario(usuario.getIdTipoDeUsuario())
                .build();
    }

    public Carne builderCarne(CarneDto carneDto){
        return Carne.builder()
                .idCarne(carneDto.getIdCarne())
                .nombreCarne(carneDto.getNombreCarne())
                .descripcionCarne(carneDto.getDescripcionCarne())
                .precioCarne(carneDto.getPrecioCarne())
                .imagenCarne(carneDto.getImagenCarne())
                .fkIdTipoDeCorte(carneDto.getFkIdTipoDeCorte())
                .build();
    }
    public CarneDto builderCarne(Carne carne){
        return CarneDto.builder()
                .idCarne(carne.getIdCarne())
                .nombreCarne(carne.getNombreCarne())
                .descripcionCarne(carne.getDescripcionCarne())
                .precioCarne(carne.getPrecioCarne())
                .imagenCarne(carne.getImagenCarne())
                .fkIdTipoDeCorte(carne.getFkIdTipoDeCorte())
                .build();
    }

    public TipoDeCarne builderTipoDeCarne(TipoDeCarneDto tipoDeCarneDto){
        return TipoDeCarne.builder()
                .idTipoDeCorte(tipoDeCarneDto.getIdTipoDeCorte())
                .tipoDeCorte(tipoDeCarneDto.getTipoDeCorte())
                .build();
    }

    public TipoDeCarneDto builderTipoDeCarne(TipoDeCarne tipoDeCarne){
        return TipoDeCarneDto.builder()
                .idTipoDeCorte(tipoDeCarne.getIdTipoDeCorte())
                .tipoDeCorte(tipoDeCarne.getTipoDeCorte())
                .build();
    }

}
