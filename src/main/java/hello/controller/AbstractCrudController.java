package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public abstract class AbstractCrudController implements ICrudController, IEntityFilterController, IPaginatedListController {

    @Override
    @RequestMapping("/get")
    public Object get(Object o) {
        return null;
    }

    @Override
    @RequestMapping("/update")
    public Object update(Object o, Object o2) {
        return null;
    }

    @Override
    @RequestMapping("/create")
    public Object create(Object o) {
        return null;
    }

    @Override
    @RequestMapping("/delete")
    public void delete(Object o) {

    }
}
