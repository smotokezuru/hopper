package jp.hohhon.hopper.test;

import java.util.List;

import junit.framework.Assert;

import jp.hohhon.hopper.domain.Item;
//import jp.hohhon.hopper.repo.ItemDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml",
"classpath:/META-INF/spring/applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class ItemDaoTest
{
//    @Autowired
//    private ItemDao itemDao;
//
//    @Test
//    public void testFindById()
//    {
//        Item item = itemDao.findById(0l);
//
////        Assert.assertEquals("John Smith", item.getName());
////        Assert.assertEquals("john.smith@mailinator.com", item.getEmail());
////        Assert.assertEquals("2125551212", item.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testFindByEmail()
//    {
//        Item item = itemDao.findByEmail("john.smith@mailinator.com");
//
////        Assert.assertEquals("John Smith", item.getName());
////        Assert.assertEquals("john.smith@mailinator.com", item.getEmail());
////        Assert.assertEquals("2125551212", item.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testRegister()
//    {
//        Item item = new Item();
////        item.setEmail("jane.doe@mailinator.com");
////        item.setName("Jane Doe");
////        item.setPhoneNumber("2125552121");
//
//        itemDao.register(item);
//        Long id = item.getId();
//        Assert.assertNotNull(id);
//        
//        Assert.assertEquals(2, itemDao.findAllOrderedByName().size());
//        Item newMember = itemDao.findById(id);
//
////        Assert.assertEquals("Jane Doe", newMember.getName());
////        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
////        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testFindAllOrderedByName()
//    {
//        Item item = new Item();
////        item.setEmail("jane.doe@mailinator.com");
////        item.setName("Jane Doe");
////        item.setPhoneNumber("2125552121");
//        itemDao.register(item);
//
//        List<Item> items = itemDao.findAllOrderedByName();
//        Assert.assertEquals(2, items.size());
//        Item newMember = items.get(0);
//
////        Assert.assertEquals("Jane Doe", newMember.getName());
////        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
////        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
}
