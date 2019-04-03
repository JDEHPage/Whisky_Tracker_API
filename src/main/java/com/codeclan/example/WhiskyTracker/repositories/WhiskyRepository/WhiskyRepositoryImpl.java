package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Whisky> findWhiskiesByRegion(String region){
//        List<Whisky> result = null;
//        Session session = entityManager.unwrap(Session.class);
//        try{
//            Criteria cr = session.createCriteria(Whisky.class);
//            cr.createAlias("distillery", "distilleryAlias");
//            cr.add(Restrictions.eq("distilleryAlias.region", region));
//
//            result = cr.list();
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        }
//        return result;
//    }
}


//    Criteria cr = session.createCriteria(Ship.class);
//        cr.createAlias("pirates", "pirateAlias");
//                cr.add(Restrictions.eq("pirateAlias.firstName", firstName));
//
//                result = cr.list();
//                } catch (HibernateException ex) {
//                ex.printStackTrace();
//                }
//
//                return result;
//                }
