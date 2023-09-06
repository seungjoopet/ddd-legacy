package kitchenpos.application;

import static kitchenpos.application.constant.KitchenposTestConst.TEST_ORDER_TABLE_NAME;
import static kitchenpos.application.constant.KitchenposTestConst.TEST_ORDER_TABLE_NUMBER_OF_GUEST;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.NoSuchElementException;
import java.util.UUID;
import kitchenpos.domain.OrderTable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("OrderTableService의 ChangeNumberOfGuests메소드 테스트")
public class OrderTableServiceChangeNumberOfGuestsTest extends OrderTableServiceTestSetup {

    @Nested
    class 메소드_호출시_예외_발생_조건_검사 {

        @Test
        void 요청_손님_수가_음수면_예외를_발생시킨다() {
            final OrderTable orderTable = orderTableRepository.save(create());
            final OrderTable request = create(-1);

            assertThatThrownBy(() -> sut.changeNumberOfGuests(orderTable.getId(), request))
                .isExactlyInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void orderTable이_없으면_예외를_발생시킨다() {
            final OrderTable request = create();

            assertThatThrownBy(() -> sut.changeNumberOfGuests(UUID.randomUUID(), request))
                .isExactlyInstanceOf(NoSuchElementException.class);
        }

        @Test
        void orderTable이_점유된_상태가_아니면_예외를_발생시킨다() {
            final OrderTable orderTable = orderTableRepository.save(create(false));
            final OrderTable request = create();

            assertThatThrownBy(() -> sut.changeNumberOfGuests(orderTable.getId(), request))
                .isExactlyInstanceOf(IllegalStateException.class);
        }

        private OrderTable create(final int numberOfGuests) {
            return createOrderTableRequest(TEST_ORDER_TABLE_NAME, numberOfGuests, false);
        }

        private OrderTable create() {
            return createOrderTableRequest(TEST_ORDER_TABLE_NAME,
                TEST_ORDER_TABLE_NUMBER_OF_GUEST, true);
        }

        private OrderTable create(final boolean occupied) {
            return createOrderTableRequest(TEST_ORDER_TABLE_NAME,
                TEST_ORDER_TABLE_NUMBER_OF_GUEST, occupied);
        }
    }
}