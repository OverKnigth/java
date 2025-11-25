package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Grupo;
import com.krakedev.persistencia.servicios.AdminGrupos;

public class TestConsultarGrupos {
	 public static void main(String[] args) {
		try {
			ArrayList<Grupo> grupos = AdminGrupos.buscarPorNombre("Anatomia");
			System.out.println(grupos);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
