package io.aranea.banking.rest;

import io.aranea.banking.rest.dto.ClientDto;
import io.aranea.banking.rest.dto.PersonDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientApi {

    @GetMapping
    public List<ClientDto> clients(
            @SortDefault.SortDefaults({
                @SortDefault(
                    sort = "uuid",
                    direction = Sort.Direction.ASC)}) Pageable pageable,
            @RequestParam(value = "query", required = false) String searchQuery) {

        return Collections.emptyList();
    }

    @PostMapping
    public String createClient(PersonDto person) {

        return "you created a client from a person";
    }

    @GetMapping("/{clientId}")
    public List<ClientDto> accounts(@PathVariable UUID clientId) {

        return Collections.emptyList();
    }
}
