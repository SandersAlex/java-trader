package trader.service.trade;

import java.util.Collections;
import java.util.List;

import trader.service.trade.TradeConstants.OrderDirection;
import trader.service.trade.TradeConstants.OrderOffsetFlag;

/**
 * 记载一条成交的明细
 */
public class TransactionImpl implements Transaction {
    private String id;
    private OrderImpl order;
    private OrderDirection direction;
    private OrderOffsetFlag offsetFlag;
    private int volume;
    private long price;
    private long time;
    private List<PositionDetail> closedDetails = Collections.emptyList();
    private PositionDetail openDetail;

    public TransactionImpl(String id, OrderImpl order, OrderDirection direction, OrderOffsetFlag offsetFlag, long price, int volume, long time) {
		this.id = id;
    	this.order = order;
		this.direction = direction;
		this.offsetFlag = offsetFlag;
		this.price = price;
		this.volume = volume;
		this.time = time;
	}

	@Override
    public String getId() {
        return id;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public OrderDirection getDirection() {
        return direction;
    }

    @Override
    public OrderOffsetFlag getOffsetFlags() {
        return offsetFlag;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public long getTime() {
        return time;
    }

    @Override
    public PositionDetail getOpenDetail() {
        return openDetail;
    }

    @Override
    public List<PositionDetail> getClosedDetails(){
        return closedDetails;
    }

    public void setOpenDetail(PositionDetail openDetail) {
        this.openDetail = openDetail;
    }

    public void setClosedDetails(List<PositionDetail> closedDetails) {
        this.closedDetails = closedDetails;
    }
}
