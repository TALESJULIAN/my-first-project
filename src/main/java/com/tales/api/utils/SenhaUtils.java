package com.tales.api.utils;

import org.springframework.boot.autoconfigure.security.*;

public class SenhaUtils {
	
	/**
	 * Gera um hash utilizando o BCrypt
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		BCryptPassowordEncoder bCryptEncoder = new BCryptPassowordEncoder();
		return bCryptEncoder.encode(senha);
	}
	
	/**
	 * Verifica se a senha é válida
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPassowordEncoder bCryptEncoder = new BCryptPassowordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}
}
