package hello.controller;

public interface ICrudController<DTO,ID> {
    DTO get(ID id);

    DTO update(DTO dto,ID id);

    DTO create(DTO dto);

    void delete(ID id);
}
