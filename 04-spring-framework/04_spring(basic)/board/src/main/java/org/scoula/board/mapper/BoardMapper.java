package org.scoula.board.mapper;

import org.scoula.board.domain.BoardVO;

import java.util.List;

public interface BoardMapper {
    public List<BoardVO> getList();
    public BoardVO get(Long no);
    public void create(BoardVO board);
    public int update(BoardVO board); // 몇 개의 행이 영향을 받았는지 값 받기 위해서!! update count: 1
    // delete랑 update (+create)가 이럼
    public int delete(Long no);
}
