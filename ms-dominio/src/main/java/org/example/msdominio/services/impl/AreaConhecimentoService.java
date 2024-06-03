package org.example.msdominio.services.impl;

import lombok.AllArgsConstructor;
import org.example.msdominio.dtos.AreaConhecimentoDTO;
import org.example.msdominio.models.AreaConhecimento;
import org.example.msdominio.repositories.AreaConhecimentoRepository;
import org.example.msdominio.services.IAreaConhecimentoService;
import org.example.msdominio.services.exceptions.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AreaConhecimentoService implements IAreaConhecimentoService {

    private final AreaConhecimentoRepository areaConhecimentoRepository;

    @Override
    public List<AreaConhecimentoDTO> findAll() {
        List<AreaConhecimento> list = areaConhecimentoRepository.findAll();
        if (list.isEmpty()) {
            throw new ResourceNotFoundException("Nenhuma area conhecimento encontrada.");
        }
        return list.stream().map(AreaConhecimentoDTO::new).toList();
    }

    @Override
    public Page<AreaConhecimentoDTO> findAll(Pageable pageable) {
        Page<AreaConhecimento> page = areaConhecimentoRepository.findAll(pageable);
        if (page.isEmpty()) {
            throw new ResourceNotFoundException("Nenhuma area conhecimento encontrada.");
        }
        return page.map(AreaConhecimentoDTO::new);
    }

    @Override
    public AreaConhecimentoDTO findById(long id) {
        AreaConhecimento areaConhecimento = areaConhecimentoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhuma area conhecimento encontrada."));
        return new AreaConhecimentoDTO(areaConhecimento);
    }

    @Override
    public AreaConhecimentoDTO save(AreaConhecimentoDTO areaConhecimentoDTO) {
        AreaConhecimento areaConhecimento = new AreaConhecimento();
        copyDtoToModel(areaConhecimentoDTO, areaConhecimento);
        areaConhecimento = areaConhecimentoRepository.save(areaConhecimento);
        return new AreaConhecimentoDTO(areaConhecimento);
    }

    @Override
    public AreaConhecimentoDTO update(long id, AreaConhecimentoDTO areaConhecimentoDTO) {
        AreaConhecimento areaConhecimento = areaConhecimentoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhuma area conhecimento encontrada."));
        copyDtoToModel(areaConhecimentoDTO, areaConhecimento);
        areaConhecimento = areaConhecimentoRepository.save(areaConhecimento);
        return new AreaConhecimentoDTO(areaConhecimento);
    }

    @Override
    public void delete(long id) {
        areaConhecimentoRepository.deleteById(id);
    }

    private void copyDtoToModel(AreaConhecimentoDTO dto, AreaConhecimento model) {
        model.setDescAreaConhecimento(dto.getDescAreaConhecimento());
        model.setCodgSeap(dto.getCodgSeap());
        model.setStatAreaConhecimento(dto.getStatAreaConhecimento());
        model.setDataImportacao(dto.getDataImportacao());
        model.setDataAtualizacao(dto.getDataAtualizacao());
    }
}
