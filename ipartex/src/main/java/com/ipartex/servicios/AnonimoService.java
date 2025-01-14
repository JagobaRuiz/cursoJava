package com.ipartex.servicios;

import com.ipartex.dtos.MensajeDTO;
import com.ipartex.entidades.Mensaje;

public interface AnonimoService {
	Iterable<Mensaje> listarMensajes();
	Mensaje detalleMensaje(Long id);
	Iterable<MensajeDTO> listarMensajesDTO(String email);
	MensajeDTO detalleMensajeDTO(Long id, String email);
	Iterable<MensajeDTO> respuestasDTO(Long id, String email);
	
}
