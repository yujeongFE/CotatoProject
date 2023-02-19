import React from "react";
import styled from "styled-components";
import FullButton from "../Components/common/FullButton";

const WriteButtonBlock = styled.div`
    display: flex;
    justify-content: c e n t e r;
    align-items: c e n t e r;
    width: 600px;
    margin-bottom: 100px;
`;

const CustomFullButton = styled(FullButton)`
    margin-right: 25px;
    margin-left: 25px;
    width: 200px;
    &:hover {
        margin-right: 25px;
        margin-left: 25px;
        width: 200px;
    }
`;

const WriteButton = ({ onCancel, onPublish }) => {
    return(
        <>
            <WriteButtonBlock>
                <CustomFullButton onClick={ onPublish }>
                    등록하기
                </CustomFullButton>
                <CustomFullButton red onClick={ onCancel }>
                    취소
                </CustomFullButton>
            </WriteButtonBlock>
        </>
    );
};

export default WriteButton;