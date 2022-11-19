package bridge.service;

import bridge.domain.Bridge;
import bridge.domain.BridgeBlock;
import bridge.domain.MovingResult;
import bridge.domain.Phase;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    public MovingResult move(Bridge bridge, BridgeBlock bridgeBlock, Phase phase) {
        if (bridge.isSameBy(bridgeBlock, phase)) {
            phase.nextPhase();
            return new MovingResult(bridgeBlock, "O");
        }
        phase.resetPhase();
        return new MovingResult(bridgeBlock, "X");
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}