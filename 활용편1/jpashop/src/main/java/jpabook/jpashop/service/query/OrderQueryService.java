package jpabook.jpashop.service.query;

import jpabook.jpashop.api.OrderApiController;
import jpabook.jpashop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderQueryService {

    private final OrderRepository orderRepository;

    public List<OrderDto> ordersV3() {
        return orderRepository.findAllWithItem()
                .stream()
                .map(OrderDto::new)
                .collect(Collectors.toList());
    }
}
