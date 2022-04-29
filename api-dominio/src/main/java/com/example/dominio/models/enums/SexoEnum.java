package com.example.dominio.models.enums;

public enum SexoEnum {

	MASCULINO(1, "M"), FEMININO(2, "F");

	private int cod;
	private String desc;

	private SexoEnum(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}

	public static SexoEnum toEnum(String desc) {

		if (desc == null) {
			return null;
		}

		for (SexoEnum index : SexoEnum.values()) {

			if (desc.equals(index.getDesc())) {
				return index;
			}
		}

		throw new IllegalArgumentException("Enum inválido: " + desc);
	}
	
	public static SexoEnum toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (SexoEnum index : SexoEnum.values()) {

			if (cod.equals(index.cod)) {
				return index;
			}
		}

		throw new IllegalArgumentException("Enum inválido: " + cod);
	}

}
