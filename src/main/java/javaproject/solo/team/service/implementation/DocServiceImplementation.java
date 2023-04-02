package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.repository.DocRepository;
import javaproject.solo.team.service.DocService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocServiceImplementation implements DocService {
    private DocRepository repository;
    public  DocServiceImplementation(DocRepository coinRepository)
    {
        super();
        this.repository = coinRepository;
    }
    @Override
    public List<Doc> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Doc save(Doc doc) {
        return this.repository.save(doc);
    }

    @Override
    public Doc getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Doc update(Doc d) {
        return this.repository.save(d);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }

//    @Override
//    public Doc searchDocs(String keyword) {
//        List<Doc> docs = repository.searchDocs(keyword);
//        if(!docs.isEmpty()){
//            return docs.get(0);
//        }else{ return null;}
//    }
}
