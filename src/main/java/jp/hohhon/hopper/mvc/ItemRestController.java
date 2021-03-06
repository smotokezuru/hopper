package jp.hohhon.hopper.mvc;

import java.util.List;

import jp.hohhon.hopper.domain.Item;
import jp.hohhon.hopper.repo.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/items")
public class ItemRestController
{
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public @ResponseBody List<Item> listAllMembers()
    {
        return itemRepository.findAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody Item lookupMemberById(@PathVariable("id") Long id)
    {
        return itemRepository.findOne(id);
    }
}
