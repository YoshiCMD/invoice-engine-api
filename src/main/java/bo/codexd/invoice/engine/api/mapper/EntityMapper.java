package bo.codexd.invoice.engine.api.mapper;

import java.util.List;

/**
 * Created by yoshi on 19 October 2023
 */
public interface EntityMapper<D, E> {
    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);

}
