package jp.hohhon.hopper.mvc;

 import javax.validation.Valid;

import jp.hohhon.hopper.domain.Item;
import jp.hohhon.hopper.repo.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class ItemController
{
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(method=RequestMethod.GET)
    public String displaySortedMembers(Model model)
    {
        model.addAttribute("newMember", new Item());
        model.addAttribute("members", itemRepository.findAll());
        return "index";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String registerNewMember(@Valid @ModelAttribute("newMember") Item newItem, BindingResult result, Model model)
    {
        if (!result.hasErrors()) {
        	itemRepository.saveAndFlush(newItem);
            return "redirect:/";
        }
        else {
            model.addAttribute("members", itemRepository.findAll());
            return "index";
        }
    }
}
