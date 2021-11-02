package africa.semicolon.yarn.data.repository;

import africa.semicolon.yarn.data.models.Storable;

import java.util.*;

public class Database<T extends Storable, ID> implements Repository<T, ID>{
   private Map<Integer, T> storage = new HashMap<> ();
    @Override
    public T save(T t) {
        Integer id;
        if (t.getId() == null){
        id = (storage.size ()+1);
        t.setId ( id );}
        id = t.getId ();
        storage.put (id , t );
        return storage.get ( id );
    }

    @Override
    public Optional<T> findById(ID id) {
        if (storage.containsKey ( id ))
        return Optional.of ( storage.get ( id ) );
        else return Optional.empty ();
    }

    @Override
    public void delete(ID id) {
        storage.remove ( id );

    }

    @Override
    public List<T> findAll() {
        List<T> all = new ArrayList<> ();
        Set<Integer> keys = storage.keySet ();
        keys.forEach ( key -> all.add ( storage.get ( key ) ) );
        return null;
    }
}
