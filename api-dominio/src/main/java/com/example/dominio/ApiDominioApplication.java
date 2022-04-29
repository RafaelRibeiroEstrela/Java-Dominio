package com.example.dominio;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dominio.models.Cidade;
import com.example.dominio.models.Pais;
import com.example.dominio.models.Pessoa;
import com.example.dominio.models.UnidadeFederativa;
import com.example.dominio.models.enums.SexoEnum;
import com.example.dominio.repositories.CargoRepository;
import com.example.dominio.repositories.CidadeRepository;
import com.example.dominio.repositories.DepartamentoRepository;
import com.example.dominio.repositories.EmpresaRepository;
import com.example.dominio.repositories.EnderecoEmpresarialRepository;
import com.example.dominio.repositories.EnderecoPessoalRepository;
import com.example.dominio.repositories.FuncionarioRepository;
import com.example.dominio.repositories.PaisRepository;
import com.example.dominio.repositories.PessoaRepository;
import com.example.dominio.repositories.SetorRepository;
import com.example.dominio.repositories.UnidadeFederativaRepository;

@SpringBootApplication
public class ApiDominioApplication implements CommandLineRunner{
	
	@Value("${spring.profiles.active}")
	private String profile;
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Autowired
	private UnidadeFederativaRepository ufRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Autowired
	private SetorRepository setorRepository;
	
	@Autowired
	private CargoRepository cargoRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private EnderecoPessoalRepository enderecoPessoalRepository;
	
	@Autowired
	private EnderecoEmpresarialRepository enderecoEmpresarialRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiDominioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		if (profile.equals("test")) {
			
			Pais pais = new Pais(null, "Brasil", 105L);
			
			UnidadeFederativa uf = new UnidadeFederativa(null, "Mato Grosso", "MT", 65L, pais);
			
			Cidade cidade = new Cidade(null, "Cuiabá", uf, 1L);
			
			Pessoa pessoa = new Pessoa(null, "Carlos", "04455599977", "25658575", LocalDate.now(), SexoEnum.MASCULINO);
			
			
		}
		
	}

}
