package lotto.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoShopTest {

    private final LottoShop lottoShop = new LottoShop();

    @DisplayName("주문 받은 로또 개수만큼 로또를 발급해준다.")
    @Test
    void createLottosByNumber() {
        PurchaseAmount purchaseAmount = new PurchaseAmount(5000);
        List<Lotto> lottos = lottoShop.createLottosBy(purchaseAmount);

        Assertions.assertThat(lottos.size()).isEqualTo(5);
    }
}
