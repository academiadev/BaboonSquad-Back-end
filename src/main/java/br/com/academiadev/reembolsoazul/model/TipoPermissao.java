package br.com.academiadev.reembolsoazul.model;

public enum TipoPermissao {
	ADMIN(1, "ROLE_ADMIN"), //
	USER(2, "ROLE_USER");

	private Integer id;

	private String descricao;

	TipoPermissao(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static TipoPermissao convertToEnum(Integer idTipoPermissao) {
		for (TipoPermissao tipoPermissao : values()) {
			if (tipoPermissao.getId() == idTipoPermissao)
				return tipoPermissao;
		}
		return null;
	}

}
